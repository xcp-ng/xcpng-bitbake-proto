
PN = "perl-Exporter-Tiny"
PE = "0"
PV = "1.006002"
PR = "7.el10"
PACKAGES = "perl-Exporter-Tiny perl-Exporter-Tiny-tests"


URI_perl-Exporter-Tiny = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Exporter-Tiny-1.006002-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Exporter-Tiny = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter::Tiny) ( ) perl(:VERSION) ( >=  5.6.1)"
RPROVIDES:perl-Exporter-Tiny = "perl(Exporter::Shiny) ( =  1.006002) perl(Exporter::Tiny) ( =  1.006002) perl-Exporter-Tiny ( =  1.006002-7.el10)"

URI_perl-Exporter-Tiny-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Exporter-Tiny-tests-1.006002-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Exporter-Tiny-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(lib) ( ) perl(base) ( ) perl(Data::Dumper) ( ) perl(Test::Fatal) ( ) perl(Test::Warnings) ( ) perl(Exporter::Shiny) ( ) perl(Exporter::Tiny) ( ) perl(:VERSION) ( >=  5.6.1) perl-Exporter-Tiny ( =  1.006002-7.el10)"
RPROVIDES:perl-Exporter-Tiny-tests = "perl-Exporter-Tiny-tests ( =  1.006002-7.el10)"
