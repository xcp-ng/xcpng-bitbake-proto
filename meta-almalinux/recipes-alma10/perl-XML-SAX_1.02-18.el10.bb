
inherit dnf-bridge

PN = "perl-XML-SAX"
PE = "0"
PV = "1.02"
PR = "18.el10"
PACKAGES = "perl-XML-SAX perl-XML-SAX-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-XML-SAX-1.02-18.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-XML-SAX = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-XML-SAX-1.02-18.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-XML-SAX}"
RDEPENDS:perl-XML-SAX = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-IO \
 perl-libwww-perl \
 perl-File-Basename \
 perl-Encode \
 perl-overload \
 perl-Symbol \
 bash \
 perl-PathTools \
 perl-XML-NamespaceSupport \
 perl-XML-SAX-Base \
 perl-XML-SAX \
 perl-Exporter \
 perl-File-Temp \
"

URI_perl-XML-SAX-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-XML-SAX-tests-1.02-18.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-XML-SAX-tests}"
RDEPENDS:perl-XML-SAX-tests = " \
 perl-Test \
 perl-Test-Harness \
 perl-libs \
 perl-vars \
 perl-IO \
 perl-XML-SAX \
 bash \
 perl-XML-SAX-Base \
 perl-autodie \
 perl-interpreter \
 perl-File-Path \
 perl-base \
"
