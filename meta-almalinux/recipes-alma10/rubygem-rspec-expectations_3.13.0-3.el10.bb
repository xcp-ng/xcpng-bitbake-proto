
inherit dnf-bridge

PN = "rubygem-rspec-expectations"
PE = "0"
PV = "3.13.0"
PR = "3.el10"
PACKAGES = "rubygem-rspec-expectations rubygem-rspec-expectations-doc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/rubygem-rspec-expectations-3.13.0-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_rubygem-rspec-expectations = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rubygem-rspec-expectations-3.13.0-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_rubygem-rspec-expectations}"
RDEPENDS:rubygem-rspec-expectations = " \
 rubygems \
 rubygem-rspec-support \
 rubygem-diff-lcs \
"

URI_rubygem-rspec-expectations-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-rspec-expectations-doc-3.13.0-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_rubygem-rspec-expectations-doc}"
RDEPENDS:rubygem-rspec-expectations-doc = " \
 rubygem-rspec-expectations \
"
