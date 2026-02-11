
PN = "perl-Test-Inter"
PE = "0"
PV = "1.10"
PR = "5.el10"
PACKAGES = "perl-Test-Inter perl-Test-Inter-tests"


URI_perl-Test-Inter = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Inter-1.10-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Inter = "perl(strict) ( ) perl(warnings) ( ) perl(lib) ( ) perl-libs ( ) perl(Cwd) ( ) perl(File::Basename) ( ) perl(IO::File) ( ) perl(:VERSION) ( >=  5.4.0)"
RPROVIDES:perl-Test-Inter = "perl-Test-Inter ( =  1.10-5.el10) perl(Test::Inter) ( =  1.10)"

URI_perl-Test-Inter-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Inter-tests-1.10-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Inter-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(lib) ( ) perl(Test::Inter) ( ) perl-Test-Inter ( =  1.10-5.el10)"
RPROVIDES:perl-Test-Inter-tests = "perl-Test-Inter-tests ( =  1.10-5.el10)"
