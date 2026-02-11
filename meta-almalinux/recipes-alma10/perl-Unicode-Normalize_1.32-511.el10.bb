
PN = "perl-Unicode-Normalize"
PE = "0"
PV = "1.32"
PR = "511.el10"
PACKAGES = "perl-Unicode-Normalize perl-Unicode-Normalize-tests"


URI_perl-Unicode-Normalize = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Unicode-Normalize-1.32-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Unicode-Normalize = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(XSLoader) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(bytes) ( ) perl(:VERSION) ( >=  5.6.0)"
RPROVIDES:perl-Unicode-Normalize = "perl(Unicode::Normalize) ( =  1.32) perl-Unicode-Normalize ( =  1.32-511.el10) perl-Unicode-Normalize(x86-64) ( =  1.32-511.el10)"

URI_perl-Unicode-Normalize-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Unicode-Normalize-tests-1.32-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Unicode-Normalize-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Unicode::Normalize) ( ) perl-Unicode-Normalize ( =  1.32-511.el10)"
RPROVIDES:perl-Unicode-Normalize-tests = "perl-Unicode-Normalize-tests ( =  1.32-511.el10) perl-Unicode-Normalize-tests(x86-64) ( =  1.32-511.el10)"
