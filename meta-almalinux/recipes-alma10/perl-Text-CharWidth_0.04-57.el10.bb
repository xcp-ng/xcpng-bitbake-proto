
PN = "perl-Text-CharWidth"
PE = "0"
PV = "0.04"
PR = "57.el10"
PACKAGES = "perl-Text-CharWidth perl-Text-CharWidth-tests"


URI_perl-Text-CharWidth = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Text-CharWidth-0.04-57.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Text-CharWidth = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(XSLoader) ( ) perl(:VERSION) ( >=  5.8.0)"
RPROVIDES:perl-Text-CharWidth = "perl(Text::CharWidth) ( =  0.04) perl-Text-CharWidth ( =  0.04-57.el10) perl-Text-CharWidth(x86-64) ( =  0.04-57.el10)"

URI_perl-Text-CharWidth-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Text-CharWidth-tests-0.04-57.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Text-CharWidth-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test::Simple) ( ) perl(Text::CharWidth) ( ) perl-Text-CharWidth ( =  0.04-57.el10)"
RPROVIDES:perl-Text-CharWidth-tests = "perl-Text-CharWidth-tests ( =  0.04-57.el10) perl-Text-CharWidth-tests(x86-64) ( =  0.04-57.el10)"
