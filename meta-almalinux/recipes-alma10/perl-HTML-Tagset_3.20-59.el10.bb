
PN = "perl-HTML-Tagset"
PE = "0"
PV = "3.20"
PR = "59.el10"
PACKAGES = "perl-HTML-Tagset perl-HTML-Tagset-tests"


URI_perl-HTML-Tagset = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-HTML-Tagset-3.20-59.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTML-Tagset = " \
 perl-libs \
 perl-vars \
"

URI_perl-HTML-Tagset-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-HTML-Tagset-tests-3.20-59.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTML-Tagset-tests = " \
 perl-Test \
 perl-Test-Harness \
 perl-libs \
 bash \
 perl-HTML-Tagset \
 perl-interpreter \
"
