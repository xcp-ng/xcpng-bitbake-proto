
PN = "perl-IO-All"
PE = "0"
PV = "0.87"
PR = "26.el10"
PACKAGES = "perl-IO-All perl-IO-All-tests"


URI_perl-IO-All = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-IO-All-0.87-26.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-All = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(File::Spec) ( ) perl(Cwd) ( ) perl(Fcntl) ( ) perl(POSIX) ( ) perl(File::Path) ( ) perl(File::Copy) ( ) perl(IO::Handle) ( ) perl(Scalar::Util) ( ) perl(overload) ( ) perl(IO::File) ( ) perl(Symbol) ( ) perl(IO::Socket) ( ) perl(File::Glob) ( ) perl(File::MimeInfo) ( ) perl(IO::All) ( ) perl(File::ReadBackwards) ( ) perl(IO::Dir) ( ) perl(Tie::File) ( )"
RPROVIDES:perl-IO-All = "perl(IO::All::Base) ( ) perl(IO::All::DBM) ( ) perl(IO::All::Dir) ( ) perl(IO::All::File) ( ) perl(IO::All::Filesys) ( ) perl(IO::All::Link) ( ) perl(IO::All::MLDBM) ( ) perl(IO::All::Pipe) ( ) perl(IO::All::STDIO) ( ) perl(IO::All::Socket) ( ) perl(IO::All::String) ( ) perl(IO::All::Temp) ( ) perl(IO::All) ( =  0.87) perl-IO-All ( =  0.87-26.el10)"

URI_perl-IO-All-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IO-All-tests-0.87-26.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-All-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Config) ( ) perl(Exporter) ( ) perl(vars) ( ) perl(File::Temp) ( ) perl(base) ( ) perl(Cwd) ( ) perl(Data::Dumper) ( ) perl(utf8) ( ) perl(File::Path) ( ) perl(File::Spec::Functions) ( ) perl(FindBin) ( ) perl(IO::Socket::INET) ( ) perl(IO::All) ( ) perl(IO::All::Base) ( ) perl(IO::All::DBM) ( ) perl(IO::All::Dir) ( ) perl(IO::All::File) ( ) perl(IO::All::Filesys) ( ) perl(IO::All::Link) ( ) perl(IO::All::MLDBM) ( ) perl(IO::All::Pipe) ( ) perl(IO::All::STDIO) ( ) perl(IO::All::Socket) ( ) perl(IO::All::String) ( ) perl(IO::All::Temp) ( ) perl(diagnostics) ( ) perl-IO-All ( =  0.87-26.el10) perl(Test::Pod) ( >=  1.41)"
RPROVIDES:perl-IO-All-tests = "perl-IO-All-tests ( =  0.87-26.el10)"
