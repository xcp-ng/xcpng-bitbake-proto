
inherit dnf-bridge

PN = "perl-Encode"
PE = "4"
PV = "3.21"
PR = "511.el10"
PACKAGES = "perl-Encode perl-Encode-devel perl-encoding perl-Encode-tests"


URI_perl-Encode = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Encode-3.21-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Encode = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-Storable \
 perl-Getopt-Long \
 perl-File-Basename \
 perl-Getopt-Std \
 perl-Encode \
 perl-overload \
 perl-parent \
 glibc \
 perl-interpreter \
 perl-Exporter \
 perl-MIME-Base64 \
"

URI_perl-Encode-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Encode-devel-3.21-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Encode-devel = " \
 perl-constant \
 perl-libs \
 perl-vars \
 perl-Getopt-Std \
 perl-Encode \
 perl-File-Find \
 perl-interpreter \
"

URI_perl-encoding = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-encoding-3.00-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-encoding = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-Filter \
 perl-Encode \
"

URI_perl-Encode-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Encode-tests-3.21-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Encode-tests = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-FileHandle \
 perl-FindBin \
 perl-open \
 perl-overload \
 perl-Symbol \
 perl-Benchmark \
 perl-Test-Harness \
 perl-Test-Simple \
 perl-vars \
 perl-IO \
 perl-IPC-Open3 \
 perl-JSON-PP \
 perl-Tie \
 perl-lib \
 perl-MIME-Base64 \
 perl-Devel-Peek \
 perl-Encode \
 bash \
 perl-encoding \
 perl-File-Basename \
 perl-File-Compare \
 perl-File-Copy \
 perl-PathTools \
 perl-interpreter \
 perl-File-Temp \
"
