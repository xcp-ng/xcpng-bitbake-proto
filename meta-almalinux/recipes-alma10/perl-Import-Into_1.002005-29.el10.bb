
PN = "perl-Import-Into"
PE = "0"
PV = "1.002005"
PR = "29.el10"
PACKAGES = "perl-Import-Into perl-Import-Into-tests"


URI_perl-Import-Into = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Import-Into-1.002005-29.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Import-Into = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Module::Runtime) ( )"
RPROVIDES:perl-Import-Into = "perl(Import::Into) ( =  1.002005) perl-Import-Into ( =  1.002005-29.el10)"

URI_perl-Import-Into-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Import-Into-tests-1.002005-29.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Import-Into-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Exporter) ( ) perl(base) ( ) perl(Import::Into) ( ) perl-Import-Into ( =  1.002005-29.el10)"
RPROVIDES:perl-Import-Into-tests = "perl-Import-Into-tests ( =  1.002005-29.el10)"
