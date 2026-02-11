
PN = "perl-Path-Tiny"
PE = "0"
PV = "0.144"
PR = "9.el10"
PACKAGES = "perl-Path-Tiny perl-Path-Tiny-tests"


URI_perl-Path-Tiny = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Path-Tiny-0.144-9.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Path-Tiny = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Config) ( ) perl(Cwd) ( ) perl(constant) ( ) perl(Fcntl) ( ) perl(Encode) ( ) perl(File::Copy) ( ) perl(overload) ( ) perl(File::Compare) ( ) perl(File::Glob) ( ) perl(threads) ( ) perl(File::stat) ( ) perl(warnings::register) ( ) perl(:VERSION) ( >=  5.8.1) perl(Exporter) ( >=  5.57) perl(Digest) ( >=  1.03) perl(Digest::SHA) ( >=  5.45) perl(File::Path) ( >=  2.07) perl(File::Spec) ( >=  0.86) perl(File::Temp) ( >=  0.18) perl(Unicode::UTF8) ( >=  0.58)"
RPROVIDES:perl-Path-Tiny = "perl(Path::Tiny::Error) ( ) perl(Path::Tiny) ( =  0.144) perl-Path-Tiny ( =  0.144-9.el10)"

URI_perl-Path-Tiny-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Path-Tiny-tests-0.144-9.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Path-Tiny-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Config) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(Cwd) ( ) perl(ExtUtils::MakeMaker) ( ) perl(File::Basename) ( ) perl(File::Spec::Functions) ( ) perl(Fcntl) ( ) perl(Digest::MD5) ( ) perl(open) ( ) perl(File::Spec::Unix) ( ) perl(File::Glob) ( ) perl(Digest) ( ) perl(Path::Tiny) ( ) perl(Test::More) ( >=  0.88) perl(:VERSION) ( >=  5.6.0) perl(:VERSION) ( >=  5.8.1) perl(Test::More) ( >=  0.96) perl(File::Temp) ( >=  0.19) perl-Path-Tiny ( =  0.144-9.el10) perl(Test::More) ( >=  0.92)"
RPROVIDES:perl-Path-Tiny-tests = "perl-Path-Tiny-tests ( =  0.144-9.el10)"
