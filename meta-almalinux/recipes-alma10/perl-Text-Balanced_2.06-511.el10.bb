
PN = "perl-Text-Balanced"
PE = "0"
PV = "2.06"
PR = "511.el10"
PACKAGES = "perl-Text-Balanced perl-Text-Balanced-tests"


URI_perl-Text-Balanced = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Text-Balanced-2.06-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Balanced = "perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(vars) ( ) perl(overload) ( ) perl(:VERSION) ( >=  5.8.1)"
RPROVIDES:perl-Text-Balanced = "perl(Text::Balanced::ErrorMsg) ( ) perl(Text::Balanced::Extractor) ( ) perl(Text::Balanced) ( =  2.06) perl-Text-Balanced ( =  2.06-511.el10)"

URI_perl-Text-Balanced-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Text-Balanced-tests-2.06-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Balanced-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Text::Balanced) ( ) perl(:VERSION) ( >=  5.8.1) perl-Text-Balanced ( =  2.06-511.el10)"
RPROVIDES:perl-Text-Balanced-tests = "perl-Text-Balanced-tests ( =  2.06-511.el10)"
