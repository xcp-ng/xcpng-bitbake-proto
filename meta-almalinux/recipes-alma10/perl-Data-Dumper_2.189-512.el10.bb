
PN = "perl-Data-Dumper"
PE = "0"
PV = "2.189"
PR = "512.el10"
PACKAGES = "perl-Data-Dumper perl-Data-Dumper-tests"


URI_perl-Data-Dumper = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Data-Dumper-2.189-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Data-Dumper = " \
 perl-constant \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-B \
 glibc \
 perl-Exporter \
"

URI_perl-Data-Dumper-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Data-Dumper-tests-2.189-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Data-Dumper-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Carp \
 perl-Test-Simple \
 perl-Encode \
 perl-overload \
 bash \
 perl-interpreter \
 perl-Data-Dumper \
 perl-Exporter \
 perl-lib \
"
