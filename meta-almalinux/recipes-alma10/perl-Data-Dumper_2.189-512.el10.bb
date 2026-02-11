
PN = "perl-Data-Dumper"
PE = "0"
PV = "2.189"
PR = "512.el10"
PACKAGES = "perl-Data-Dumper perl-Data-Dumper-tests"


URI_perl-Data-Dumper = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Data-Dumper-2.189-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Data-Dumper = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) libperl.so.5.40()(64bit) ( ) perl(XSLoader) ( ) perl(constant) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(Scalar::Util) ( ) perl(bytes) ( ) perl(B::Deparse) ( ) perl(:VERSION) ( >=  5.8.0)"
RPROVIDES:perl-Data-Dumper = "perl(Data::Dumper) ( =  2.189) perl-Data-Dumper ( =  2.189-512.el10) perl-Data-Dumper(x86-64) ( =  2.189-512.el10)"

URI_perl-Data-Dumper-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Data-Dumper-tests-2.189-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Data-Dumper-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(lib) ( ) perl(Config) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(Data::Dumper) ( ) perl(overload) ( ) perl(Encode) ( ) perl(:VERSION) ( >=  5.8.0) perl-Data-Dumper ( =  2.189-512.el10) perl(Test::More) ( >=  0.60)"
RPROVIDES:perl-Data-Dumper-tests = "perl-Data-Dumper-tests ( =  2.189-512.el10) perl-Data-Dumper-tests(x86-64) ( =  2.189-512.el10)"
