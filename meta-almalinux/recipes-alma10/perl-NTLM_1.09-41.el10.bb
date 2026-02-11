
PN = "perl-NTLM"
PE = "0"
PV = "1.09"
PR = "41.el10"
PACKAGES = "perl-NTLM perl-NTLM-tests"


URI_perl-NTLM = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-NTLM-1.09-41.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-NTLM = "perl(strict) ( ) perl-libs ( ) perl(Exporter) ( ) perl(vars) ( ) perl(constant) ( ) perl(MIME::Base64) ( ) perl(Digest::HMAC_MD5) ( ) perl(Authen::NTLM::DES) ( ) perl(Authen::NTLM::MD4) ( )"
RPROVIDES:perl-NTLM = "perl(Authen::NTLM) ( =  1.09) perl(Authen::NTLM::DES) ( =  1.02) perl(Authen::NTLM::MD4) ( =  1.02) perl-NTLM ( =  1.09-41.el10)"

URI_perl-NTLM-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-NTLM-tests-1.09-41.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-NTLM-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(MIME::Base64) ( ) perl(Authen::NTLM) ( ) perl-NTLM ( =  1.09-41.el10)"
RPROVIDES:perl-NTLM-tests = "perl-NTLM-tests ( =  1.09-41.el10)"
