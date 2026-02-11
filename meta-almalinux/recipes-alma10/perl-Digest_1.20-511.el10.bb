
PN = "perl-Digest"
PE = "0"
PV = "1.20"
PR = "511.el10"
PACKAGES = "perl-Digest perl-Digest-tests"


URI_perl-Digest = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Digest-1.20-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Digest = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(MIME::Base64) ( ) perl(Digest) ( )"
RPROVIDES:perl-Digest = "perl(Digest) ( =  1.20) perl(Digest::base) ( =  1.20) perl(Digest::file) ( =  1.20) perl-Digest ( =  1.20-511.el10)"

URI_perl-Digest-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Digest-tests-1.20-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Digest-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(lib) ( ) perl(File::Temp) ( ) perl(Digest::base) ( ) perl(Digest) ( ) perl(Digest::file) ( ) perl-Digest ( =  1.20-511.el10)"
RPROVIDES:perl-Digest-tests = "perl-Digest-tests ( =  1.20-511.el10)"
