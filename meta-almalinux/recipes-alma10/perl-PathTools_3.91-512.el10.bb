
PN = "perl-PathTools"
PE = "0"
PV = "3.91"
PR = "512.el10"
PACKAGES = "perl-PathTools perl-PathTools-tests"


URI_perl-PathTools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-PathTools-3.91-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-PathTools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(Exporter) ( ) libperl.so.5.40()(64bit) ( ) perl(constant) ( ) perl(File::Spec) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(Cwd) ( ) perl(Scalar::Util) ( ) perl(Errno) ( ) perl(File::Spec::Unix) ( )"
RPROVIDES:perl-PathTools = "perl(Cwd) ( =  3.91) perl(File::Spec) ( =  3.91) perl(File::Spec::AmigaOS) ( =  3.91) perl(File::Spec::Cygwin) ( =  3.91) perl(File::Spec::Epoc) ( =  3.91) perl(File::Spec::Functions) ( =  3.91) perl(File::Spec::Mac) ( =  3.91) perl(File::Spec::OS2) ( =  3.91) perl(File::Spec::Unix) ( =  3.91) perl(File::Spec::Win32) ( =  3.91) perl-PathTools ( =  3.91-512.el10) perl-PathTools(x86-64) ( =  3.91-512.el10)"

URI_perl-PathTools-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-PathTools-tests-3.91-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-PathTools-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Config) ( ) perl(Carp) ( ) perl(File::Temp) ( ) perl(Cwd) ( ) perl(File::Path) ( ) perl(Scalar::Util) ( ) perl(Errno) ( ) perl(Carp::Heavy) ( ) perl(File::Spec::Win32) ( ) perl-PathTools ( =  3.91-512.el10)"
RPROVIDES:perl-PathTools-tests = "perl-PathTools-tests ( =  3.91-512.el10) perl-PathTools-tests(x86-64) ( =  3.91-512.el10)"
