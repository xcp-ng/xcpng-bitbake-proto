
PN = "perl-XML-LibXML"
PE = "1"
PV = "2.0210"
PR = "4.el10"
PACKAGES = "perl-XML-LibXML perl-XML-LibXML-tests"


URI_perl-XML-LibXML = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-XML-LibXML-2.0210-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-XML-LibXML = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-overload \
 perl-parent \
 perl-Carp \
 perl-vars \
 perl-IO \
 perl-Data-Dumper \
 libxml2 \
 perl-XML-LibXML \
 perl-Encode \
 perl-XML-NamespaceSupport \
 perl-XML-SAX \
 bash \
 perl-XML-SAX-Base \
 perl-Exporter \
 perl-base \
 perl-constant \
 glibc \
 perl-interpreter \
"

URI_perl-XML-LibXML-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-XML-LibXML-tests-2.0210-4.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-XML-LibXML-tests = " \
 perl-Scalar-List-Utils \
 perl-libs \
 glibc-gconv-extra \
 perl-locale \
 perl-overload \
 perl-parent \
 perl-Test-Harness \
 perl-Test-Simple \
 perl-Carp \
 perl-vars \
 perl-IO \
 perl-Data-Dumper \
 perl-XML-LibXML \
 perl-XML-SAX \
 bash \
 perl-XML-SAX-Base \
 perl-Errno \
 perl-Exporter \
 perl-constant \
 perl-ExtUtils-MakeMaker \
 perl-POSIX \
 perl-PathTools \
 perl-interpreter \
 perl-lib \
"
