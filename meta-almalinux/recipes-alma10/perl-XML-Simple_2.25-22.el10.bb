
PN = "perl-XML-Simple"
PE = "0"
PV = "2.25"
PR = "22.el10"
PACKAGES = "perl-XML-Simple perl-XML-Simple-tests"


URI_perl-XML-Simple = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-XML-Simple-2.25-22.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-XML-Simple = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-IO \
 perl-Storable \
 perl-File-Basename \
 perl-XML-NamespaceSupport \
 perl-XML-Parser \
 perl-XML-SAX \
 perl-PathTools \
 perl-Exporter \
"

URI_perl-XML-Simple-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-XML-Simple-tests-2.25-22.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-XML-Simple-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-vars \
 perl-IO \
 perl-FileHandle \
 bash \
 perl-PathTools \
 perl-XML-SAX-Base \
 perl-XML-Simple \
 perl-interpreter \
 perl-base \
 perl-File-Temp \
"
