
PN = "perl-gettext"
PE = "0"
PV = "1.07"
PR = "35.el10"
PACKAGES = "perl-Locale-gettext perl-Locale-gettext-tests"


URI_perl-Locale-gettext = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Locale-gettext-1.07-35.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Locale-gettext = "rtld(GNU_HASH) ( ) perl-libs ( ) perl(Exporter) ( ) perl(Carp) ( ) libperl.so.5.40()(64bit) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(POSIX) ( ) perl(DynaLoader) ( ) libc.so.6(GLIBC_2.2.5)(64bit) ( )"
RPROVIDES:perl-Locale-gettext = "perl(Locale::gettext) ( =  1.07) perl-Locale-gettext ( =  1.07-35.el10) perl-Locale-gettext(x86-64) ( =  1.07-35.el10)"

URI_perl-Locale-gettext-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Locale-gettext-tests-1.07-35.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Locale-gettext-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test) ( ) perl(Locale::gettext) ( ) perl-Locale-gettext ( =  1.07-35.el10)"
RPROVIDES:perl-Locale-gettext-tests = "perl-Locale-gettext-tests ( =  1.07-35.el10) perl-Locale-gettext-tests(x86-64) ( =  1.07-35.el10)"
