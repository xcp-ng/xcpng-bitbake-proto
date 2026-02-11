
PN = "perl-BSD-Resource"
PE = "0"
PV = "1.291.100"
PR = "29.el10"
PACKAGES = "perl-BSD-Resource perl-BSD-Resource-tests"


URI_perl-BSD-Resource = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-BSD-Resource-1.291.100-29.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-BSD-Resource = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(Exporter) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(vars) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(DynaLoader) ( ) perl(AutoLoader) ( ) perl(:VERSION) ( >=  5.2.0)"
RPROVIDES:perl-BSD-Resource = "perl(BSD::Resource) ( =  1.2911) perl-BSD-Resource ( =  1.291.100-29.el10) perl-BSD-Resource(x86-64) ( =  1.291.100-29.el10)"

URI_perl-BSD-Resource-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-BSD-Resource-tests-1.291.100-29.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-BSD-Resource-tests = "/usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(BSD::Resource) ( ) perl-BSD-Resource ( =  1.291.100-29.el10)"
RPROVIDES:perl-BSD-Resource-tests = "perl-BSD-Resource-tests ( =  1.291.100-29.el10)"
