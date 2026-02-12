
inherit dnf-bridge

PN = "perl-XML-NamespaceSupport"
PE = "0"
PV = "1.12"
PR = "25.el10"
PACKAGES = "perl-XML-NamespaceSupport perl-XML-NamespaceSupport-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-XML-NamespaceSupport-1.12-25.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-XML-NamespaceSupport = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-XML-NamespaceSupport-1.12-25.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-XML-NamespaceSupport}"
RDEPENDS:perl-XML-NamespaceSupport = " \
 perl-constant \
 perl-libs \
 perl-vars \
"

URI_perl-XML-NamespaceSupport-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-XML-NamespaceSupport-tests-1.12-25.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-XML-NamespaceSupport-tests}"
RDEPENDS:perl-XML-NamespaceSupport-tests = " \
 perl-constant \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-XML-NamespaceSupport \
 bash \
 perl-interpreter \
"
