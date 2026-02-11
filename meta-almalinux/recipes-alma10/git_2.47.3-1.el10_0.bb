
PN = "git"
PE = "0"
PV = "2.47.3"
PR = "1.el10_0"
PACKAGES = "git git-all git-core git-core-doc git-credential-libsecret git-daemon git-email git-gui git-instaweb git-subtree git-svn gitk gitweb perl-Git perl-Git-SVN"


URI_git = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/git-2.47.3-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:git = "/usr/bin/sh ( ) perl(strict) ( ) perl(warnings) ( ) /usr/bin/perl ( ) perl(File::Spec) ( ) perl(File::Basename) ( ) perl(Getopt::Long) ( ) perl(lib) ( ) perl(File::Find) ( ) perl(Git) ( ) perl(Term::ReadKey) ( ) perl(IPC::Open2) ( ) perl(:VERSION) ( >=  5.8.1) git-core ( =  2.47.3-1.el10_0) perl-Git ( =  2.47.3-1.el10_0) git-core-doc ( =  2.47.3-1.el10_0)"
RPROVIDES:git = "git ( =  2.47.3-1.el10_0) git(x86-64) ( =  2.47.3-1.el10_0)"

URI_git-all = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/git-all-2.47.3-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:git-all = "perl(Term::ReadKey) ( ) git ( =  2.47.3-1.el10_0) perl-Git ( =  2.47.3-1.el10_0) git-gui ( =  2.47.3-1.el10_0) gitk ( =  2.47.3-1.el10_0) git-credential-libsecret ( =  2.47.3-1.el10_0) git-daemon ( =  2.47.3-1.el10_0) git-email ( =  2.47.3-1.el10_0) git-instaweb ( =  2.47.3-1.el10_0) git-subtree ( =  2.47.3-1.el10_0) git-svn ( =  2.47.3-1.el10_0)"
RPROVIDES:git-all = "git-all ( =  2.47.3-1.el10_0)"

URI_git-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/git-core-2.47.3-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:git-core = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) libz.so.1()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libcurl.so.4()(64bit) ( ) libz.so.1(ZLIB_1.2.0)(64bit) ( ) libpcre2-8.so.0()(64bit) ( ) openssh-clients ( ) libexpat.so.1()(64bit) ( ) libz.so.1(ZLIB_1.2.2)(64bit) ( ) less ( ) zlib ( >=  1.2)"
RPROVIDES:git-core = "git-core ( =  2.47.3-1.el10_0) git-core(x86-64) ( =  2.47.3-1.el10_0)"

URI_git-core-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/git-core-doc-2.47.3-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:git-core-doc = "git-core ( =  2.47.3-1.el10_0)"
RPROVIDES:git-core-doc = "git-core-doc ( =  2.47.3-1.el10_0)"

URI_git-credential-libsecret = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/git-credential-libsecret-2.47.3-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:git-credential-libsecret = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libsecret-1.so.0()(64bit) ( ) git ( =  2.47.3-1.el10_0)"
RPROVIDES:git-credential-libsecret = "git-credential-libsecret ( =  2.47.3-1.el10_0) git-credential-libsecret(x86-64) ( =  2.47.3-1.el10_0)"

URI_git-daemon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/git-daemon-2.47.3-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:git-daemon = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libz.so.1()(64bit) ( ) libz.so.1(ZLIB_1.2.0)(64bit) ( ) libpcre2-8.so.0()(64bit) ( ) git-core ( =  2.47.3-1.el10_0)"
RPROVIDES:git-daemon = "git-daemon ( =  2.47.3-1.el10_0) config(git-daemon) ( =  2.47.3-1.el10_0) git-daemon(x86-64) ( =  2.47.3-1.el10_0)"

URI_git-email = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/git-email-2.47.3-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:git-email = "perl(strict) ( ) perl(warnings) ( ) /usr/bin/perl ( ) perl(File::Spec) ( ) perl(POSIX) ( ) perl(Getopt::Long) ( ) perl(Cwd) ( ) perl(lib) ( ) perl(File::Temp) ( ) perl(Text::ParseWords) ( ) perl(MIME::Base64) ( ) perl(File::Spec::Functions) ( ) perl(Git) ( ) perl(IO::Socket::SSL) ( ) perl(Sys::Hostname) ( ) perl(Term::ANSIColor) ( ) perl(Term::ReadLine) ( ) perl(Error) ( ) perl(MIME::QuotedPrint) ( ) perl(Net::SMTP) ( ) perl(Authen::SASL) ( ) perl(Net::Domain) ( ) perl(Git::I18N) ( ) perl(Mail::Address) ( ) perl(Net::SMTP::SSL) ( ) perl(:VERSION) ( >=  5.8.1) git ( =  2.47.3-1.el10_0)"
RPROVIDES:git-email = "git-email ( =  2.47.3-1.el10_0)"

URI_git-gui = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/git-gui-2.47.3-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:git-gui = "/usr/bin/sh ( ) tk ( >=  8.4) gitk ( =  2.47.3-1.el10_0)"
RPROVIDES:git-gui = "application() ( ) application(git-gui.desktop) ( ) git-gui ( =  2.47.3-1.el10_0)"

URI_git-instaweb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/git-instaweb-2.47.3-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:git-instaweb = "/usr/bin/sh ( ) httpd ( ) git ( =  2.47.3-1.el10_0) gitweb ( =  2.47.3-1.el10_0)"
RPROVIDES:git-instaweb = "git-instaweb ( =  2.47.3-1.el10_0)"

URI_git-subtree = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/git-subtree-2.47.3-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:git-subtree = "/usr/bin/sh ( ) git-core ( =  2.47.3-1.el10_0)"
RPROVIDES:git-subtree = "git-subtree ( =  2.47.3-1.el10_0)"

URI_git-svn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/git-svn-2.47.3-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:git-svn = "perl(strict) ( ) perl(warnings) ( ) perl(Carp) ( ) /usr/bin/perl ( ) perl(vars) ( ) perl(File::Spec) ( ) perl(File::Basename) ( ) perl(Getopt::Long) ( ) perl(lib) ( ) perl(File::Path) ( ) perl(Digest::MD5) ( ) subversion ( ) perl(Git) ( ) perl(Term::ReadKey) ( ) perl(Memoize) ( ) perl(Git::SVN) ( ) perl(Git::SVN::Editor) ( ) perl(Git::SVN::Fetcher) ( ) perl(Git::SVN::Log) ( ) perl(Git::SVN::Migration) ( ) perl(Git::SVN::Prompt) ( ) perl(Git::SVN::Ra) ( ) perl(Git::SVN::Utils) ( ) perl(:VERSION) ( >=  5.8.1) git ( =  2.47.3-1.el10_0)"
RPROVIDES:git-svn = "git-svn ( =  2.47.3-1.el10_0)"

URI_gitk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gitk-2.47.3-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:gitk = "/usr/bin/sh ( ) git ( =  2.47.3-1.el10_0) tk ( >=  8.4) git-gui ( =  2.47.3-1.el10_0)"
RPROVIDES:gitk = "gitk ( =  2.47.3-1.el10_0)"

URI_gitweb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gitweb-2.47.3-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:gitweb = "perl(strict) ( ) perl(warnings) ( ) /usr/bin/perl ( ) perl(constant) ( ) perl(File::Basename) ( ) perl(Fcntl) ( ) perl(Encode) ( ) perl(File::Find) ( ) perl(Time::HiRes) ( ) perl(Digest::MD5) ( ) perl(CGI) ( ) perl(CGI::Util) ( ) perl(CGI::Carp) ( ) perl(filetest) ( ) perl(:VERSION) ( >=  5.8.1) git ( =  2.47.3-1.el10_0)"
RPROVIDES:gitweb = "gitweb ( =  2.47.3-1.el10_0) config(gitweb) ( =  2.47.3-1.el10_0)"

URI_perl-Git = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Git-2.47.3-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Git = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(constant) ( ) perl(Git) ( ) perl(Error) ( ) perl(:VERSION) ( >=  5.8.1) git ( =  2.47.3-1.el10_0)"
RPROVIDES:perl-Git = "perl(Git::I18N) ( ) perl(Git::Error::Command) ( ) perl(Git::IndexInfo) ( ) perl(Git::Packet) ( ) perl(Git::activestate_pipe) ( ) perl-Git ( =  2.47.3-1.el10_0) perl(Git) ( =  0.01)"

URI_perl-Git-SVN = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Git-SVN-2.47.3-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:perl-Git-SVN = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(vars) ( ) perl(constant) ( ) perl(POSIX) ( ) perl(File::Basename) ( ) perl(Fcntl) ( ) perl(base) ( ) perl(File::Path) ( ) perl(Time::Local) ( ) perl(Storable) ( ) perl(Git) ( ) perl(IPC::Open3) ( ) perl(Memoize) ( ) perl(SVN::Core) ( ) perl(SVN::Delta) ( ) perl(SVN::Ra) ( ) perl(YAML::Any) ( ) git ( =  2.47.3-1.el10_0)"
RPROVIDES:perl-Git-SVN = "perl(Git::SVN) ( ) perl(Git::SVN::Editor) ( ) perl(Git::SVN::Fetcher) ( ) perl(Git::SVN::Log) ( ) perl(Git::SVN::Migration) ( ) perl(Git::SVN::Prompt) ( ) perl(Git::SVN::Ra) ( ) perl(Git::SVN::Utils) ( ) perl(Git::SVN::GlobSpec) ( ) perl(Git::SVN::Memoize::YAML) ( ) perl-Git-SVN ( =  2.47.3-1.el10_0)"
