
PN = "perl-Net-SSLeay"
PE = "0"
PV = "1.94"
PR = "7.el10"
PACKAGES = "perl-Net-SSLeay perl-Net-SSLeay-tests"


URI_perl-Net-SSLeay = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Net-SSLeay-1.94-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Net-SSLeay = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) perl(Carp) ( ) perl(Exporter) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(vars) ( ) perl(XSLoader) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(Socket) ( ) perl(Errno) ( ) perl(MIME::Base64) ( ) perl(AutoLoader) ( ) perl(Net::SSLeay) ( ) libssl.so.3(OPENSSL_3.2.0)(64bit) ( ) perl(:VERSION) ( >=  5.8.1)"
RPROVIDES:perl-Net-SSLeay = "perl(Net::SSLeay) ( =  1.94) perl(Net::SSLeay::Handle) ( =  1.94) perl-Net-SSLeay ( =  1.94-7.el10) perl-Net-SSLeay(x86-64) ( =  1.94-7.el10)"

URI_perl-Net-SSLeay-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Net-SSLeay-tests-1.94-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Net-SSLeay-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Config) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(base) ( ) perl(Cwd) ( ) perl(utf8) ( ) perl(IO::Handle) ( ) perl(File::Basename) ( ) perl(Scalar::Util) ( ) perl(File::Spec::Functions) ( ) perl(FindBin) ( ) perl(Symbol) ( ) perl(threads) ( ) perl(Socket) ( ) perl(Storable) ( ) perl(Test::Builder) ( ) perl(English) ( ) perl(Net::SSLeay) ( ) perl(SelectSaver) ( ) perl(Net::SSLeay::Handle) ( ) perl(:VERSION) ( >=  5.8.1) perl-Net-SSLeay ( =  1.94-7.el10)"
RPROVIDES:perl-Net-SSLeay-tests = "perl-Net-SSLeay-tests ( =  1.94-7.el10) perl-Net-SSLeay-tests(x86-64) ( =  1.94-7.el10)"
