
inherit dnf-bridge

PN = "perl-Data-Section"
PE = "0"
PV = "0.200008"
PR = "8.el10"
PACKAGES = "perl-Data-Section perl-Data-Section-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Data-Section-0.200008-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Data-Section = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Data-Section-0.200008-8.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Data-Section}"
RDEPENDS:perl-Data-Section = " \
 perl-Encode \
 perl-MRO-Compat \
 perl-libs \
 perl-Sub-Exporter \
"

URI_perl-Data-Section-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Data-Section-tests-0.200008-8.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Data-Section-tests}"
RDEPENDS:perl-Data-Section-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-ExtUtils-MakeMaker \
 perl-Test-FailWarnings \
 perl-Data-Section \
 perl-Encode \
 bash \
 perl-PathTools \
 perl-interpreter \
 perl-base \
 perl-lib \
"
