
inherit dnf-bridge

PN = "perl-Moo"
PE = "0"
PV = "2.005005"
PR = "7.el10"
PACKAGES = "perl-Moo"


URI_perl-Moo = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Moo-2.005005-7.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Moo = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-Import-Into \
 perl-Module-Runtime \
 perl-mro \
 perl-Class-Method-Modifiers \
 perl-Devel-GlobalDestruction \
 perl-Role-Tiny \
 perl-Exporter \
 perl-Sub-Quote \
"
