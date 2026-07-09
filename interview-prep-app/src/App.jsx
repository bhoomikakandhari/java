import React, { useState, useEffect, useMemo } from 'react';
import { questionsData } from './data/questions';

const App = () => {
  // State
  const [filter, setFilter] = useState('All');
  const [searchTerm, setSearchTerm] = useState('');
  const [bookmarks, setBookmarks] = useState(JSON.parse(localStorage.getItem('bookmarks')) || []);
  const [solved, setSolved] = useState(JSON.parse(localStorage.getItem('solved')) || []);
  const [timeLeft, setTimeLeft] = useState(0);
  const [isActive, setIsActive] = useState(false);

  // Persistence
  useEffect(() => {
    localStorage.setItem('bookmarks', JSON.stringify(bookmarks));
    localStorage.setItem('solved', JSON.stringify(solved));
  }, [bookmarks, solved]);

  // Timer Logic
  useEffect(() => {
    let interval = null;
    if (isActive && timeLeft > 0) {
      interval = setInterval(() => setTimeLeft((t) => t - 1), 1000);
    } else if (timeLeft === 0) {
      setIsActive(false);
      clearInterval(interval);
    }
    return () => clearInterval(interval);
  }, [isActive, timeLeft]);

  // Derived Data: Progress Stats
  const stats = useMemo(() => {
    const categories = ['DSA', 'JavaScript', 'React'];
    return categories.map(cat => {
      const total = questionsData.filter(q => q.topic === cat).length;
      const count = solved.filter(id => questionsData.find(q => q.id === id)?.topic === cat).length;
      return { name: cat, percent: Math.round((count / total) * 100) };
    });
  }, [solved]);

  // Filter & Search Logic
  const filteredList = questionsData.filter(q => {
    const matchesFilter = filter === 'All' || q.topic === filter;
    const matchesSearch = q.question.toLowerCase().includes(searchTerm.toLowerCase());
    return matchesFilter && matchesSearch;
  });

  const toggle = (id, list, setList) => {
    setList(prev => prev.includes(id) ? prev.filter(i => i !== id) : [...prev, id]);
  };

  const formatTime = (s) => `${Math.floor(s / 60)}:${(s % 60).toString().padStart(2, '0')}`;

  return (
    <div className="max-w-5xl mx-auto px-4 py-8">
      {/* Header & Stats */}
      <header className="flex flex-col md:flex-row justify-between items-start md:items-center mb-10 gap-6">
        <div>
          <h1 className="text-4xl font-extrabold text-slate-800 tracking-tight">Interview<span className="text-indigo-600">Pro</span></h1>
          <p className="text-slate-500 mt-1">Master your technical rounds.</p>
        </div>
        
        <div className="flex gap-4 items-center bg-white p-4 rounded-2xl shadow-sm border border-slate-100">
          <div className="text-center px-4 border-r border-slate-100">
            <p className="text-xs text-slate-400 uppercase font-bold">Timer</p>
            <p className={`text-2xl font-mono font-bold ${timeLeft < 60 && timeLeft > 0 ? 'text-red-500' : 'text-slate-700'}`}>
              {formatTime(timeLeft)}
            </p>
          </div>
          <button 
            onClick={() => {setTimeLeft(1800); setIsActive(true);}}
            className="bg-indigo-600 hover:bg-indigo-700 text-white px-5 py-2 rounded-xl transition-all shadow-md shadow-indigo-100 font-medium"
          >
            Start Mock
          </button>
        </div>
      </header>

      <div className="grid grid-cols-1 lg:grid-cols-4 gap-8">
        {/* Sidebar: Progress Tracking */}
        <aside className="lg:col-span-1 space-y-6">
          <div className="bg-white p-6 rounded-2xl shadow-sm border border-slate-100">
            <h2 className="font-bold text-slate-800 mb-4 flex items-center gap-2">
              📊 Topic Progress
            </h2>
            {stats.map(s => (
              <div key={s.name} className="mb-4">
                <div className="flex justify-between text-sm mb-1">
                  <span className="font-medium text-slate-600">{s.name}</span>
                  <span className="text-indigo-600 font-bold">{s.percent}%</span>
                </div>
                <div className="w-full bg-slate-100 h-2 rounded-full overflow-hidden">
                  <div className="bg-indigo-500 h-full transition-all duration-500" style={{ width: `${s.percent}%` }} />
                </div>
              </div>
            ))}
          </div>

          <div className="bg-indigo-50 p-6 rounded-2xl border border-indigo-100">
            <h3 className="font-bold text-indigo-900 mb-2">Pro Tip 💡</h3>
            <p className="text-sm text-indigo-700 leading-relaxed">
              Try explaining the answers out loud. If you can't explain it simply, you don't know it well enough.
            </p>
          </div>
        </aside>

        {/* Main Content: Questions */}
        <section className="lg:col-span-3">
          <div className="flex flex-col sm:flex-row gap-4 mb-6">
            <input 
              type="text" 
              placeholder="Search questions..."
              className="flex-1 px-4 py-3 rounded-xl border border-slate-200 focus:outline-none focus:ring-2 focus:ring-indigo-500 bg-white"
              onChange={(e) => setSearchTerm(e.target.value)}
            />
            <select 
              className="px-4 py-3 rounded-xl border border-slate-200 bg-white focus:outline-none"
              onChange={(e) => setFilter(e.target.value)}
            >
              <option value="All">All Topics</option>
              <option value="DSA">DSA</option>
              <option value="JavaScript">JavaScript</option>
              <option value="React">React</option>
            </select>
          </div>

          <div className="space-y-4">
            {filteredList.length > 0 ? filteredList.map(q => (
              <div key={q.id} className={`group bg-white p-6 rounded-2xl border transition-all duration-200 ${solved.includes(q.id) ? 'border-green-200 bg-green-50/30' : 'border-slate-100 hover:border-indigo-200 hover:shadow-md'}`}>
                <div className="flex justify-between items-start mb-3">
                  <span className={`px-3 py-1 rounded-full text-[10px] font-bold uppercase tracking-wider ${q.topic === 'DSA' ? 'bg-orange-100 text-orange-600' : q.topic === 'React' ? 'bg-blue-100 text-blue-600' : 'bg-yellow-100 text-yellow-700'}`}>
                    {q.topic}
                  </span>
                  <button 
                    onClick={() => toggle(q.id, bookmarks, setBookmarks)}
                    className={`text-xl transition-transform active:scale-125 ${bookmarks.includes(q.id) ? 'text-yellow-400' : 'text-slate-300'}`}
                  >
                    {bookmarks.includes(q.id) ? '★' : '☆'}
                  </button>
                </div>
                
                <h3 className="text-lg font-semibold text-slate-800 mb-4 group-hover:text-indigo-700 transition-colors">
                  {q.question}
                </h3>

                <div className="flex items-center gap-4">
                  <button 
                    onClick={() => toggle(q.id, solved, setSolved)}
                    className={`flex items-center gap-2 text-sm font-semibold px-4 py-2 rounded-lg transition-colors ${solved.includes(q.id) ? 'bg-green-500 text-white' : 'bg-slate-100 text-slate-600 hover:bg-slate-200'}`}
                  >
                    {solved.includes(q.id) ? '✓ Completed' : 'Mark as Done'}
                  </button>
                  
                  <details className="group/ans">
                    <summary className="text-sm font-medium text-indigo-600 cursor-pointer hover:underline list-none">
                      Show Answer
                    </summary>
                    <div className="mt-3 text-slate-600 text-sm p-4 bg-slate-50 rounded-xl border border-slate-100">
                      {q.answer}
                    </div>
                  </details>
                </div>
              </div>
            )) : (
              <div className="text-center py-20 bg-white rounded-2xl border border-dashed border-slate-300">
                <p className="text-slate-400">No questions found matching your search.</p>
              </div>
            )}
          </div>
        </section>
      </div>
    </div>
  );
};

export default App;