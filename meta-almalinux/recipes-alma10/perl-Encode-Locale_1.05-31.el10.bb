
PN = "perl-Encode-Locale"
PE = "0"
PV = "1.05"
PR = "31.el10"
PACKAGES = "perl-Encode-Locale perl-Encode-Locale-tests"


URI_perl-Encode-Locale = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Encode-Locale-1.05-31.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Encode-Locale = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(base) ( ) perl(Encode::Alias) ( ) perl(I18N::Langinfo) ( ) perl(Encode) ( >=  2)"
RPROVIDES:perl-Encode-Locale = "perl(Encode::Locale) ( =  1.05) perl-Encode-Locale ( =  1.05-31.el10)"

URI_perl-Encode-Locale-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Encode-Locale-tests-1.05-31.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Encode-Locale-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(utf8) ( ) perl(Encode::Locale) ( ) perl-Encode-Locale ( =  1.05-31.el10)"
RPROVIDES:perl-Encode-Locale-tests = "perl-Encode-Locale-tests ( =  1.05-31.el10)"
