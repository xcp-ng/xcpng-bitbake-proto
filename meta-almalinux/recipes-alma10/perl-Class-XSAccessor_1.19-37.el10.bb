
PN = "perl-Class-XSAccessor"
PE = "0"
PV = "1.19"
PR = "37.el10"
PACKAGES = "perl-Class-XSAccessor perl-Class-XSAccessor-tests"


URI_perl-Class-XSAccessor = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Class-XSAccessor-1.19-37.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Class-XSAccessor = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(XSLoader) ( ) perl(Class::XSAccessor) ( ) perl(:VERSION) ( >=  5.8.0)"
RPROVIDES:perl-Class-XSAccessor = "perl(Class::XSAccessor) ( =  1.19) perl(Class::XSAccessor::Array) ( =  1.19) perl-Class-XSAccessor ( =  1.19-37.el10) perl-Class-XSAccessor(x86-64) ( =  1.19-37.el10)"

URI_perl-Class-XSAccessor-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Class-XSAccessor-tests-1.19-37.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Class-XSAccessor-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Config) ( ) perl(Data::Dumper) ( ) perl(constant) ( ) perl(threads) ( ) perl(Time::HiRes) ( ) perl(Class::XSAccessor) ( ) perl(Class::XSAccessor::Array) ( ) perl-Class-XSAccessor ( =  1.19-37.el10)"
RPROVIDES:perl-Class-XSAccessor-tests = "perl-Class-XSAccessor-tests ( =  1.19-37.el10) perl-Class-XSAccessor-tests(x86-64) ( =  1.19-37.el10)"
