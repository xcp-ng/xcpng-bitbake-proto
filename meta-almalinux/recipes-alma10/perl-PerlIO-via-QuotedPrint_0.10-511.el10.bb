
PN = "perl-PerlIO-via-QuotedPrint"
PE = "0"
PV = "0.10"
PR = "511.el10"
PACKAGES = "perl-PerlIO-via-QuotedPrint perl-PerlIO-via-QuotedPrint-tests"


URI_perl-PerlIO-via-QuotedPrint = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-PerlIO-via-QuotedPrint-0.10-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-PerlIO-via-QuotedPrint = "perl(strict) ( ) perl-libs ( ) perl(MIME::QuotedPrint) ( ) perl(:VERSION) ( >=  5.8.1)"
RPROVIDES:perl-PerlIO-via-QuotedPrint = "perl(PerlIO::via::QuotedPrint) ( =  0.10) perl-PerlIO-via-QuotedPrint ( =  0.10-511.el10)"

URI_perl-PerlIO-via-QuotedPrint-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-PerlIO-via-QuotedPrint-tests-0.10-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-PerlIO-via-QuotedPrint-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(:VERSION) ( >=  5.8.1) perl-PerlIO-via-QuotedPrint ( =  0.10-511.el10)"
RPROVIDES:perl-PerlIO-via-QuotedPrint-tests = "perl-PerlIO-via-QuotedPrint-tests ( =  0.10-511.el10)"
