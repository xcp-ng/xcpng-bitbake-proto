
PN = "perl-Exporter"
PE = "0"
PV = "5.78"
PR = "511.el10"
PACKAGES = "perl-Exporter perl-Exporter-tests"


URI_perl-Exporter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Exporter-5.78-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Exporter = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( >=  1.05)"
RPROVIDES:perl-Exporter = "perl(Exporter) ( =  5.78) perl(Exporter::Heavy) ( =  5.78) perl-Exporter ( =  5.78-511.el10)"

URI_perl-Exporter-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Exporter-tests-5.78-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Exporter-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(vars) ( ) perl(Exporter::Heavy) ( ) perl-Exporter ( =  5.78-511.el10)"
RPROVIDES:perl-Exporter-tests = "perl-Exporter-tests ( =  5.78-511.el10)"
