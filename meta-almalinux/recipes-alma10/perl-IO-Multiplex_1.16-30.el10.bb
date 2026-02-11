
PN = "perl-IO-Multiplex"
PE = "0"
PV = "1.16"
PR = "30.el10"
PACKAGES = "perl-IO-Multiplex perl-IO-Multiplex-tests"


URI_perl-IO-Multiplex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-IO-Multiplex-1.16-30.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-Multiplex = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(vars) ( ) perl(constant) ( ) perl(POSIX) ( ) perl(Fcntl) ( ) perl(IO::Handle) ( ) perl(Socket) ( ) perl(Time::HiRes) ( ) perl(FileHandle) ( ) perl(Tie::Handle) ( )"
RPROVIDES:perl-IO-Multiplex = "perl(IO::Multiplex::Handle) ( ) perl(IO::Multiplex) ( =  1.16) perl-IO-Multiplex ( =  1.16-30.el10)"

URI_perl-IO-Multiplex-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IO-Multiplex-tests-1.16-30.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-Multiplex-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test) ( ) perl(POSIX) ( ) perl(Fcntl) ( ) perl(IO::Socket) ( ) perl(IO::Multiplex) ( ) perl-IO-Multiplex ( =  1.16-30.el10)"
RPROVIDES:perl-IO-Multiplex-tests = "perl-IO-Multiplex-tests ( =  1.16-30.el10)"
