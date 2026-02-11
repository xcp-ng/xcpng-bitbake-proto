
inherit dnf-bridge

PN = "perl-Fedora-VSP"
PE = "0"
PV = "0.001"
PR = "36.el10"
PACKAGES = "perl-Fedora-VSP perl-Fedora-VSP-tests"


URI_perl-Fedora-VSP = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Fedora-VSP-0.001-36.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Fedora-VSP = " \
 perl-libs \
"

URI_perl-Fedora-VSP-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Fedora-VSP-tests-0.001-36.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Fedora-VSP-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-version \
 perl-Fedora-VSP \
 bash \
 perl-interpreter \
"
