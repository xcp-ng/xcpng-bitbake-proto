
inherit dnf-bridge

PN = "perl-PerlIO-via-QuotedPrint"
PE = "0"
PV = "0.10"
PR = "511.el10"
PACKAGES = "perl-PerlIO-via-QuotedPrint perl-PerlIO-via-QuotedPrint-tests"


URI_perl-PerlIO-via-QuotedPrint = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-PerlIO-via-QuotedPrint-0.10-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-PerlIO-via-QuotedPrint = " \
 perl-libs \
 perl-MIME-Base64 \
"

URI_perl-PerlIO-via-QuotedPrint-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-PerlIO-via-QuotedPrint-tests-0.10-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-PerlIO-via-QuotedPrint-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 bash \
 perl-PerlIO-via-QuotedPrint \
 perl-interpreter \
"
