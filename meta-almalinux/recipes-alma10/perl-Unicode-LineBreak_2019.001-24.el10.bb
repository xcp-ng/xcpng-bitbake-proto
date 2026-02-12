
inherit dnf-bridge

PN = "perl-Unicode-LineBreak"
PE = "0"
PV = "2019.001"
PR = "24.el10"
PACKAGES = "perl-Unicode-LineBreak perl-Unicode-LineBreak-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Unicode-LineBreak-2019.001-24.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Unicode-LineBreak = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Unicode-LineBreak-2019.001-24.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_perl-Unicode-LineBreak}"
RDEPENDS:perl-Unicode-LineBreak = " \
 perl-MIME-Charset \
 sombok \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-Unicode-LineBreak \
 perl-Encode \
 perl-overload \
 glibc \
 perl-Exporter \
"

URI_perl-Unicode-LineBreak-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Unicode-LineBreak-tests-2019.001-24.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_perl-Unicode-LineBreak-tests}"
RDEPENDS:perl-Unicode-LineBreak-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Unicode-LineBreak \
 perl-FindBin \
 bash \
 perl-interpreter \
 perl-lib \
"
