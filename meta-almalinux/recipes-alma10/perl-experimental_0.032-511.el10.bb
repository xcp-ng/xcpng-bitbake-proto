
PN = "perl-experimental"
PE = "0"
PV = "0.032"
PR = "511.el10"
PACKAGES = "perl-experimental perl-experimental-tests"


URI_perl-experimental = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-experimental-0.032-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-experimental = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(feature) ( ) perl(version) ( ) perl(experimental) ( )"
RPROVIDES:perl-experimental = "perl(experimental) ( =  0.032) perl(stable) ( =  0.032) perl-experimental ( =  0.032-511.el10)"

URI_perl-experimental-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-experimental-tests-0.032-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-experimental-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl-experimental ( =  0.032-511.el10) perl(Test::More) ( >=  0.89)"
RPROVIDES:perl-experimental-tests = "perl-experimental-tests ( =  0.032-511.el10)"
