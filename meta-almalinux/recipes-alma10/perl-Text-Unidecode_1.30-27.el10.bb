
PN = "perl-Text-Unidecode"
PE = "0"
PV = "1.30"
PR = "27.el10"
PACKAGES = "perl-Text-Unidecode perl-Text-Unidecode-tests"


URI_perl-Text-Unidecode = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Text-Unidecode-1.30-27.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Unidecode = "perl(strict) ( ) perl-libs ( ) perl(Exporter) ( ) perl(vars) ( ) perl(integer) ( ) perl(utf8) ( ) perl(:VERSION) ( >=  5.8.0)"
RPROVIDES:perl-Text-Unidecode = "perl(Text::Unidecode) ( =  1.30) perl-Text-Unidecode ( =  1.30-27.el10)"

URI_perl-Text-Unidecode-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Text-Unidecode-tests-1.30-27.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Unidecode-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(utf8) ( ) perl(Test) ( ) perl(Text::Unidecode) ( ) perl(Text::Wrap) ( ) perl(:VERSION) ( >=  5.8.0) perl(:VERSION) ( >=  5.0.0) perl-Text-Unidecode ( =  1.30-27.el10)"
RPROVIDES:perl-Text-Unidecode-tests = "perl-Text-Unidecode-tests ( =  1.30-27.el10)"
