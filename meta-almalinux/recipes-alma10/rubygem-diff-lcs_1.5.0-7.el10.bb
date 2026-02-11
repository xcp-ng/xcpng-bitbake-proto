
PN = "rubygem-diff-lcs"
PE = "0"
PV = "1.5.0"
PR = "7.el10"
PACKAGES = "rubygem-diff-lcs rubygem-diff-lcs-doc"


URI_rubygem-diff-lcs = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rubygem-diff-lcs-1.5.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:rubygem-diff-lcs = " \
 rubygems \
 ruby \
"

URI_rubygem-diff-lcs-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-diff-lcs-doc-1.5.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:rubygem-diff-lcs-doc = " \
 rubygem-diff-lcs \
"
