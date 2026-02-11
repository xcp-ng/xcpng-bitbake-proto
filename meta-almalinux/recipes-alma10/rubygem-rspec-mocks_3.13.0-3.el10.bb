
inherit dnf-bridge

PN = "rubygem-rspec-mocks"
PE = "0"
PV = "3.13.0"
PR = "3.el10"
PACKAGES = "rubygem-rspec-mocks rubygem-rspec-mocks-doc"


URI_rubygem-rspec-mocks = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rubygem-rspec-mocks-3.13.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:rubygem-rspec-mocks = " \
 rubygems \
 rubygem-rspec-support \
 rubygem-diff-lcs \
"

URI_rubygem-rspec-mocks-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-rspec-mocks-doc-3.13.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:rubygem-rspec-mocks-doc = " \
 rubygem-rspec-mocks \
"
