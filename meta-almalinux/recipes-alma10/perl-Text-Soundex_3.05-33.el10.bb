
PN = "perl-Text-Soundex"
PE = "0"
PV = "3.05"
PR = "33.el10"
PACKAGES = "perl-Text-Soundex perl-Text-Soundex-tests"


URI_perl-Text-Soundex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Text-Soundex-3.05-33.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Text-Soundex = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(Exporter) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(XSLoader) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(if) ( ) perl(Text::Unidecode) ( ) perl(deprecate) ( ) perl(:VERSION) ( >=  5.6.0)"
RPROVIDES:perl-Text-Soundex = "perl(Text::Soundex) ( =  3.05) perl-Text-Soundex ( =  3.05-33.el10) perl-Text-Soundex(x86-64) ( =  3.05-33.el10)"

URI_perl-Text-Soundex-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Text-Soundex-tests-3.05-33.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Text-Soundex-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl-Text-Soundex ( =  3.05-33.el10)"
RPROVIDES:perl-Text-Soundex-tests = "perl-Text-Soundex-tests ( =  3.05-33.el10) perl-Text-Soundex-tests(x86-64) ( =  3.05-33.el10)"
