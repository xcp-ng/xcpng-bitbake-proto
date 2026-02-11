
PN = "perl-Authen-SASL"
PE = "0"
PV = "2.1700"
PR = "5.el10"
PACKAGES = "perl-Authen-SASL perl-Authen-SASL-tests"


URI_perl-Authen-SASL = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Authen-SASL-2.1700-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Authen-SASL = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(vars) ( ) perl(bytes) ( ) perl(Digest::MD5) ( ) perl(Tie::Handle) ( ) perl(Digest::HMAC_MD5) ( ) perl(GSSAPI) ( )"
RPROVIDES:perl-Authen-SASL = "perl(Authen::SASL) ( =  2.1700) perl(Authen::SASL::CRAM_MD5) ( =  2.1700) perl(Authen::SASL::EXTERNAL) ( =  2.1700) perl(Authen::SASL::Perl) ( =  2.1700) perl(Authen::SASL::Perl::ANONYMOUS) ( =  2.1700) perl(Authen::SASL::Perl::CRAM_MD5) ( =  2.1700) perl(Authen::SASL::Perl::DIGEST_MD5) ( =  2.1700) perl(Authen::SASL::Perl::EXTERNAL) ( =  2.1700) perl(Authen::SASL::Perl::GSSAPI) ( =  2.1700) perl(Authen::SASL::Perl::LOGIN) ( =  2.1700) perl(Authen::SASL::Perl::PLAIN) ( =  2.1700) perl-Authen-SASL ( =  2.1700-5.el10)"

URI_perl-Authen-SASL-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Authen-SASL-tests-2.1700-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Authen-SASL-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Carp) ( ) perl(FindBin) ( ) perl(Digest::MD5) ( ) perl(Digest::HMAC_MD5) ( ) perl(Authen::SASL) ( ) perl-Authen-SASL ( =  2.1700-5.el10)"
RPROVIDES:perl-Authen-SASL-tests = "perl-Authen-SASL-tests ( =  2.1700-5.el10)"
