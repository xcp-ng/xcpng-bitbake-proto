
inherit dnf-bridge

PN = "rubygem-rouge"
PE = "0"
PV = "4.2.0"
PR = "3.el10"
PACKAGES = "rubygem-rouge rubygem-rouge-doc"


URI_rubygem-rouge = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-rouge-4.2.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:rubygem-rouge = " \
 rubygems \
 ruby \
"

URI_rubygem-rouge-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-rouge-doc-4.2.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:rubygem-rouge-doc = " \
 rubygem-rouge \
"
