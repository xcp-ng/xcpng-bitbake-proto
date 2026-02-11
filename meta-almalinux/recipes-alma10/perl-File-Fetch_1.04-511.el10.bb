
PN = "perl-File-Fetch"
PE = "0"
PV = "1.04"
PR = "511.el10"
PACKAGES = "perl-File-Fetch perl-File-Fetch-tests"


URI_perl-File-Fetch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-File-Fetch-1.04-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Fetch = "perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(vars) ( ) perl(constant) ( ) perl(File::Basename) ( ) perl(Cwd) ( ) perl(File::Path) ( ) perl(File::Temp) ( ) perl(File::Copy) ( ) perl(FileHandle) ( ) perl(File::Spec::Unix) ( ) perl(Locale::Maketext::Simple) ( ) perl(File::Spec) ( >=  0.82) perl(Module::Load::Conditional) ( >=  0.66) perl(IPC::Cmd) ( >=  0.42) perl(Params::Check) ( >=  0.07)"
RPROVIDES:perl-File-Fetch = "perl(File::Fetch) ( =  1.04) perl-File-Fetch ( =  1.04-511.el10)"

URI_perl-File-Fetch-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-Fetch-tests-1.04-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Fetch-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(lib) ( ) perl(vars) ( ) perl(Cwd) ( ) perl(Data::Dumper) ( ) perl(File::Path) ( ) perl(File::Basename) ( ) perl(IO::Socket::INET) ( ) perl-File-Fetch ( =  1.04-511.el10)"
RPROVIDES:perl-File-Fetch-tests = "perl-File-Fetch-tests ( =  1.04-511.el10)"
