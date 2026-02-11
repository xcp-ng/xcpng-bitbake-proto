
PN = "perl-Object-Deadly"
PE = "0"
PV = "0.09"
PR = "48.el10"
PACKAGES = "perl-Object-Deadly perl-Object-Deadly-tests"


URI_perl-Object-Deadly = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Object-Deadly-0.09-48.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Object-Deadly = "perl(strict) ( ) perl(vars) ( ) perl-libs ( ) perl(overload) ( ) perl(Scalar::Util) ( ) perl(B) ( ) perl(English) ( ) perl(Object::Deadly) ( ) perl(Devel::StackTrace) ( ) perl(Devel::Symdump) ( ) perl(Carp::Clan) ( >=  5.4)"
RPROVIDES:perl-Object-Deadly = "perl(Object::Deadly::_safe) ( ) perl(Object::Deadly::_unsafe) ( ) perl-Object-Deadly ( =  0.09-48.el10) perl(Object::Deadly) ( =  0.09)"

URI_perl-Object-Deadly-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Object-Deadly-tests-0.09-48.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Object-Deadly-tests = "/usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test::More) ( ) perl(overload) ( ) perl(Scalar::Util) ( ) perl(Symbol) ( ) perl(Object::Deadly) ( ) perl(Test::Exception) ( ) perl-Object-Deadly ( =  0.09-48.el10)"
RPROVIDES:perl-Object-Deadly-tests = "perl-Object-Deadly-tests ( =  0.09-48.el10)"
