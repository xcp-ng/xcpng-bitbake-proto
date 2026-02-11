
PN = "perl-Devel-GlobalDestruction"
PE = "0"
PV = "0.14"
PR = "27.el10"
PACKAGES = "perl-Devel-GlobalDestruction perl-Devel-GlobalDestruction-tests"


URI_perl-Devel-GlobalDestruction = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Devel-GlobalDestruction-0.14-27.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Devel-GlobalDestruction = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Sub::Exporter::Progressive) ( )"
RPROVIDES:perl-Devel-GlobalDestruction = "perl(Devel::GlobalDestruction) ( =  0.14) perl-Devel-GlobalDestruction ( =  0.14-27.el10)"

URI_perl-Devel-GlobalDestruction-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Devel-GlobalDestruction-tests-0.14-27.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Devel-GlobalDestruction-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Config) ( ) perl(POSIX) ( ) perl(FindBin) ( ) perl(threads) ( ) perl(threads::shared) ( ) perl(Devel::GlobalDestruction) ( ) perl(IPC::Open2) ( ) perl-Devel-GlobalDestruction ( =  0.14-27.el10)"
RPROVIDES:perl-Devel-GlobalDestruction-tests = "perl-Devel-GlobalDestruction-tests ( =  0.14-27.el10)"
