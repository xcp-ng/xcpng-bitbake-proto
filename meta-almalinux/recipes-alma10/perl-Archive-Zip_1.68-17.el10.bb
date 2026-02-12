
inherit dnf-bridge

PN = "perl-Archive-Zip"
PE = "0"
PV = "1.68"
PR = "17.el10"
PACKAGES = "perl-Archive-Zip perl-Archive-Zip-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-Archive-Zip-1.68-17.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Archive-Zip = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Archive-Zip-1.68-17.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Archive-Zip}"
RDEPENDS:perl-Archive-Zip = " \
 perl-libs \
 perl-FileHandle \
 perl-Archive-Zip \
 perl-Carp \
 perl-vars \
 perl-IO \
 perl-Compress-Raw-Zlib \
 perl-lib \
 perl-Time-Local \
 perl-Encode \
 perl-Exporter \
 perl-constant \
 perl-File-Basename \
 perl-File-Copy \
 perl-PathTools \
 perl-File-Find \
 perl-interpreter \
 perl-File-Path \
 perl-File-Temp \
"

URI_perl-Archive-Zip-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Archive-Zip-tests-1.68-17.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Archive-Zip-tests}"
RDEPENDS:perl-Archive-Zip-tests = " \
 perl-constant \
 zip \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-IO \
 unzip \
 perl-IO-Compress \
 perl-Archive-Zip \
 perl-File-Temp \
 bash \
 perl-PathTools \
 perl-File-Find \
 perl-interpreter \
 perl-File-Path \
 perl-Exporter \
 perl-lib \
"
