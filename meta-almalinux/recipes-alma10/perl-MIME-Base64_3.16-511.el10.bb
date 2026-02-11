
PN = "perl-MIME-Base64"
PE = "0"
PV = "3.16"
PR = "511.el10"
PACKAGES = "perl-MIME-Base64 perl-MIME-Base64-tests"


URI_perl-MIME-Base64 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-MIME-Base64-3.16-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-MIME-Base64 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) libperl.so.5.40()(64bit) ( ) perl(XSLoader) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(MIME::Base64) ( )"
RPROVIDES:perl-MIME-Base64 = "perl(MIME::Base64) ( =  3.16) perl(MIME::QuotedPrint) ( =  3.16) perl-MIME-Base64 ( =  3.16-511.el10) perl-MIME-Base64(x86-64) ( =  3.16-511.el10)"

URI_perl-MIME-Base64-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-MIME-Base64-tests-3.16-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-MIME-Base64-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(File::Spec) ( ) perl(ExtUtils::MakeMaker) ( ) perl(Test) ( ) perl(MIME::Base64) ( ) perl(MIME::QuotedPrint) ( ) perl-MIME-Base64 ( =  3.16-511.el10)"
RPROVIDES:perl-MIME-Base64-tests = "perl-MIME-Base64-tests ( =  3.16-511.el10) perl-MIME-Base64-tests(x86-64) ( =  3.16-511.el10)"
