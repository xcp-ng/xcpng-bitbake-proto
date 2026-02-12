
inherit dnf-bridge

PN = "rubygem-rspec-support"
PE = "0"
PV = "3.13.0"
PR = "3.el10"
PACKAGES = "rubygem-rspec-support rubygem-rspec-support-doc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/rubygem-rspec-support-3.13.0-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_rubygem-rspec-support = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rubygem-rspec-support-3.13.0-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_rubygem-rspec-support}"
RDEPENDS:rubygem-rspec-support = " \
 rubygems \
"

URI_rubygem-rspec-support-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-rspec-support-doc-3.13.0-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_rubygem-rspec-support-doc}"
RDEPENDS:rubygem-rspec-support-doc = " \
 rubygem-rspec-support \
"
