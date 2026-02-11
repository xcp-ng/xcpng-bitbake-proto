
PN = "perl-File-Listing"
PE = "0"
PV = "6.16"
PR = "5.el10"
PACKAGES = "perl-File-Listing perl-File-Listing-tests"


URI_perl-File-Listing = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-File-Listing-6.16-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Listing = " \
 perl-HTTP-Date \
 perl-Exporter \
 perl-libs \
 perl-Carp \
"

URI_perl-File-Listing-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-Listing-tests-6.16-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Listing-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 bash \
 perl-interpreter \
 perl-File-Listing \
"
