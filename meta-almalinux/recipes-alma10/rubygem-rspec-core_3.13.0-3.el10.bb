
inherit dnf-bridge

PN = "rubygem-rspec-core"
PE = "0"
PV = "3.13.0"
PR = "3.el10"
PACKAGES = "rubygem-rspec-core rubygem-rspec-core-doc"


URI_rubygem-rspec-core = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rubygem-rspec-core-3.13.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:rubygem-rspec-core = " \
 rubygem-rake \
 ruby \
 rubygem-rspec-support \
 rubygems \
 coreutils \
"

URI_rubygem-rspec-core-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-rspec-core-doc-3.13.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:rubygem-rspec-core-doc = " \
 rubygem-rspec-core \
"
