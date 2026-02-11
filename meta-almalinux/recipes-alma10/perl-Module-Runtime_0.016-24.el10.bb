
PN = "perl-Module-Runtime"
PE = "0"
PV = "0.016"
PR = "24.el10"
PACKAGES = "perl-Module-Runtime perl-Module-Runtime-tests"


URI_perl-Module-Runtime = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Module-Runtime-0.016-24.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Runtime = "perl-libs ( ) perl(:VERSION) ( >=  5.6.0)"
RPROVIDES:perl-Module-Runtime = "perl(Module::Runtime) ( =  0.016) perl-Module-Runtime ( =  0.016-24.el10)"

URI_perl-Module-Runtime-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-Runtime-tests-0.016-24.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-Runtime-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Module::Runtime) ( ) perl-Module-Runtime ( =  0.016-24.el10) perl(Test::More) ( >=  0.41)"
RPROVIDES:perl-Module-Runtime-tests = "perl-Module-Runtime-tests ( =  0.016-24.el10)"
