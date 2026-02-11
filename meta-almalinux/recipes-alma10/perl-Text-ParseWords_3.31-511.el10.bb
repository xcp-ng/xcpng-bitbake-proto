
PN = "perl-Text-ParseWords"
PE = "0"
PV = "3.31"
PR = "511.el10"
PACKAGES = "perl-Text-ParseWords perl-Text-ParseWords-tests"


URI_perl-Text-ParseWords = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Text-ParseWords-3.31-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-ParseWords = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(:VERSION) ( >=  5.6.0)"
RPROVIDES:perl-Text-ParseWords = "perl(Text::ParseWords) ( =  3.31) perl-Text-ParseWords ( =  3.31-511.el10)"

URI_perl-Text-ParseWords-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Text-ParseWords-tests-3.31-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-ParseWords-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Scalar::Util) ( ) perl(Text::ParseWords) ( ) perl-Text-ParseWords ( =  3.31-511.el10)"
RPROVIDES:perl-Text-ParseWords-tests = "perl-Text-ParseWords-tests ( =  3.31-511.el10)"
