
inherit dnf-bridge

PN = "perl-Filter-Simple"
PE = "0"
PV = "0.96"
PR = "511.el10"
PACKAGES = "perl-Filter-Simple perl-Filter-Simple-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Filter-Simple-0.96-511.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Filter-Simple = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Filter-Simple-0.96-511.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Filter-Simple}"
RDEPENDS:perl-Filter-Simple = " \
 perl-Text-Balanced \
 perl-libs \
 perl-Carp \
 perl-Filter \
"

URI_perl-Filter-Simple-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Filter-Simple-tests-0.96-511.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Filter-Simple-tests}"
RDEPENDS:perl-Filter-Simple-tests = " \
 perl-Test-Harness \
 perl-Filter-Simple \
 bash \
 perl-parent \
 perl-interpreter \
 perl-Exporter \
"
