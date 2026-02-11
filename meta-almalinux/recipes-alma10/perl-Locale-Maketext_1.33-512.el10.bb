
PN = "perl-Locale-Maketext"
PE = "0"
PV = "1.33"
PR = "512.el10"
PACKAGES = "perl-Locale-Maketext perl-Locale-Maketext-tests"


URI_perl-Locale-Maketext = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Locale-Maketext-1.33-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Locale-Maketext = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(integer) ( ) perl(Locale::Maketext) ( ) perl(I18N::LangTags::Detect) ( ) perl(I18N::LangTags) ( >=  0.31)"
RPROVIDES:perl-Locale-Maketext = "perl(Locale::Maketext) ( =  1.33) perl(Locale::Maketext::Guts) ( =  1.20) perl(Locale::Maketext::GutsLoader) ( =  1.20) perl-Locale-Maketext ( =  1.33-512.el10)"

URI_perl-Locale-Maketext-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Locale-Maketext-tests-1.33-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Locale-Maketext-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(utf8) ( ) perl(Scalar::Util) ( ) perl(parent) ( ) perl(Locale::Maketext) ( ) perl(:VERSION) ( >=  5.0.0) perl-Locale-Maketext ( =  1.33-512.el10)"
RPROVIDES:perl-Locale-Maketext-tests = "perl-Locale-Maketext-tests ( =  1.33-512.el10)"
