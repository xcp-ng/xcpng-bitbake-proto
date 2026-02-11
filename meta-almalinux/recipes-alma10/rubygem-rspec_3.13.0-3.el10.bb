
inherit dnf-bridge

PN = "rubygem-rspec"
PE = "0"
PV = "3.13.0"
PR = "3.el10"
PACKAGES = "rubygem-rspec rubygem-rspec-doc"


URI_rubygem-rspec = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rubygem-rspec-3.13.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:rubygem-rspec = " \
 rubygems \
 rubygem-rspec-mocks \
 rubygem-rspec-core \
 rubygem-rspec-expectations \
"

URI_rubygem-rspec-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-rspec-doc-3.13.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:rubygem-rspec-doc = " \
 rubygem-rspec \
"
